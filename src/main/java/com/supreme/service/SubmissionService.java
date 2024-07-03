package com.supreme.service;

import com.supreme.model.Submission;
import org.apache.catalina.LifecycleState;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SubmissionService {

    Submission submitTask(Long taskId,String githubLink,Long userId,String jwt)throws Exception;

    Submission getTaskSubmissionById(Long submissionId)throws Exception;

    List<Submission> getAllTaskSubmissions();

    List<Submission> getTaskSubmissionByTaskId(Long taskId);

    Submission acceptDeclineSubmission(Long id, String status)throws Exception;
}
