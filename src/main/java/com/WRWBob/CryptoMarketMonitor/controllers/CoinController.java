package com.WRWBob.CryptoMarketMonitor.controllers;

import com.WRWBob.CryptoMarketMonitor.services.CoinService;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class CoinController {
    private final CoinService coinService;
    @GetMapping("/")
    public String products(@RequestParam(name = "title", required = false) String title) {
        return productService.getProducts(title).toString();
    }
}
