package com.danny.taxifa.services;

import com.danny.taxifa.entities.FeedBackReply;
import com.danny.taxifa.repositories.FeedBackReplyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FeedBackReplyService {

    @Autowired
    private FeedBackReplyRepository feedBackReplyRepository;

    public FeedBackReply replyAFeedBack(FeedBackReply feedBackReply){
        return feedBackReplyRepository.save(feedBackReply);
    }


    public void deleteReplies(int id){
        feedBackReplyRepository.deleteById(id);
    }

    public FeedBackReply findRepliesById(int id)  {
        return feedBackReplyRepository.findById(id).orElseThrow();
    }

    public FeedBackReply editReply(FeedBackReply feedBackReply){
        return feedBackReplyRepository.save(feedBackReply);
    }

    public List<FeedBackReply> getAllFeedBackReplies(){
        return feedBackReplyRepository.findAll();
    }



}
