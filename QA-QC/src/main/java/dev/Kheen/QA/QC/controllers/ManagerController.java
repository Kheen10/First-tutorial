package dev.Kheen.QA.QC.controllers;

import dev.Kheen.QA.QC.models.Manager;
import dev.Kheen.QA.QC.repository.ManagerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/manager")
public class ManagerController {
    @Autowired
    private ManagerRepository managerRepository;

    @GetMapping("/reviews")
    public List<Manager> getAllReviews() {
        return managerRepository.findAll();
    }

    @PostMapping("/reviews")
    public void reviewChecker(@RequestBody Map<String, String> payload) {
        String reviewId = payload.get("reviewId");
        Manager docs = managerRepository.findByReviewId(reviewId);
        docs.checkReview(payload.get("checkedReview"));
        docs.sentMail(payload.get("sentMail"));
        managerRepository.save(docs);

    }
}