package com.example.zyro.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = {"http://localhost:5173", "http://localhost:3000", "https://zyro-frontend-code-jc4n.vercel.app"})
public class ChatController {

    @PostMapping("/chat")
    public ResponseEntity<Map<String, String>> handleChat(@RequestBody Map<String, String> request) {
        String userMessage = request.getOrDefault("message", "").trim().toLowerCase();
        Map<String, String> response = new HashMap<>();

        String reply;
        if (userMessage.contains("deposit") || userMessage.contains("refund")) {
            reply = "Security deposit 100% refundable! Return tharuvatha owner verify chesi, no damage unte deposit direct ga UPI ki refund avthundi.";
        } else if (userMessage.contains("size") || userMessage.contains("fit")) {
            reply = "Zyro lo unna prathi ethnic outfit ki standard S, M, L options untayi. Margin alteration loops kuda provide chestharu.";
        } else if (userMessage.contains("pickup") || userMessage.contains("address") || userMessage.contains("delivery")) {
            reply = "Meeru Banjara Hills, Jubilee Hills, Madhapur lo direct self-pickup chesukovachu, leda Zyro Express Courier opt cheyochu.";
        } else if (userMessage.contains("wedding") || userMessage.contains("reception") || userMessage.contains("sangeet") || userMessage.contains("lehenga")) {
            reply = "Wedding receptions ki Royal Velvet Maroon lehenga with Polki Kundan choker perfect match! Standout royal look isthundi.";
        } else {
            reply = "Namaste! Nenu Zyro AI Assistant ni. Ethnic outfits styling, sizes, pickup points mariyu security deposit refund gurinchi nannu adagavachu.";
        }

        response.put("reply", reply);
        return ResponseEntity.ok(response);
    }
}
