package com.yonglun.itineraryassistant.controller;

import com.yonglun.itineraryassistant.model.Itinerary;
import org.springframework.ai.chat.client.ChatClient;
// 1. Change your import to the ChatMemory interface
import org.springframework.ai.chat.memory.ChatMemory;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/itinerary")
public class ItineraryController {
    private final ChatClient chatClient;

    public ItineraryController(ChatClient chatClient) {
        this.chatClient = chatClient;
    }

    @PostMapping("/generate")
    public Itinerary generateItinerary(@RequestBody ItineraryRequest request) {
        return chatClient.prompt()
                .user(request.prompt())
                .advisors(advisor -> advisor.param(
                        // 2. Use the new constant here
                        ChatMemory.CONVERSATION_ID,
                        request.conversationId()
                ))
                .call()
                .entity(Itinerary.class);
    }

    public record ItineraryRequest(String conversationId, String prompt) {}
}
