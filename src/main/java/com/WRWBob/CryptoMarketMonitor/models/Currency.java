package com.WRWBob.CryptoMarketMonitor.models;

import java.util.Arrays;

public enum Currency {

    AUD(), BRL(), CAD(), CHF(), CLP(), CNY(), CZK(), DKK(), EUR(), GBP(), HKD(), HUF(), IDR(), ILS(), INR(), JPY(), KRW(), MXN(), MYR(), NOK(), NZD(), PHP(), PKR(), PLN(), RUB(), SEK(), SGD(), THB(), TRY(), TWD(), ZAR(), USD(), BTC(CurrencyType.CRYPTO), ETH(CurrencyType.CRYPTO), XRP(CurrencyType.CRYPTO), LTC(CurrencyType.CRYPTO), BCH(CurrencyType.CRYPTO);

    private static Currency[] fiatCurrencies;
    private static Currency[] cryptoCurrencies;
    private final CurrencyType type;

    Currency() {
        this(CurrencyType.FIAT);
    }

    Currency(CurrencyType type) {
        this.type = type;
    }

    public static Currency[] getFiatCurrencies() {
        if (fiatCurrencies == null) {
            fiatCurrencies = Arrays.stream(values()).filter(Currency::isFiat).toArray(Currency[]::new);
        }
        return fiatCurrencies;
    }

    public static Currency[] getCryptoCurrencies() {
        if (cryptoCurrencies == null) {
            cryptoCurrencies = Arrays.stream(values()).filter(Currency::isCrypto).toArray(Currency[]::new);
        }
        return cryptoCurrencies;
    }

    public CurrencyType getType() {
        return type;
    }

    public boolean isFiat() {
        return CurrencyType.FIAT == this.type;
    }

    public boolean isCrypto() {
        return CurrencyType.CRYPTO == this.type;
    }

    enum CurrencyType {
        FIAT, CRYPTO
    }
}
