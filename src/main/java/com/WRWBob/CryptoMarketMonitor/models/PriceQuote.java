package com.WRWBob.CryptoMarketMonitor.models;

public class PriceQuote {
    private final double price;
    private final double dayVolume;
    private final double marketCap;
    private final double hourChange;
    private final double dayChange;
    private final double weekChange;

    public PriceQuote(double price, double dayVolume, double marketCap, double hourChange, double dayChange, double weekChange) {
        this.price = price;
        this.dayVolume = dayVolume;
        this.marketCap = marketCap;
        this.hourChange = hourChange;
        this.dayChange = dayChange;
        this.weekChange = weekChange;
    }

    public double getPrice() {
        return this.price;
    }

    public double getDayVolume() {
        return this.dayVolume;
    }

    public double getMarketCap() {
        return this.marketCap;
    }

    public double getHourChange() {
        return this.hourChange;
    }

    public double getDayChange() {
        return this.dayChange;
    }

    public double getWeekChange() {
        return this.weekChange;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof PriceQuote)) return false;
        final PriceQuote other = (PriceQuote) o;
        if (!other.canEqual((Object) this)) return false;
        if (Double.compare(this.getPrice(), other.getPrice()) != 0) return false;
        if (Double.compare(this.getDayVolume(), other.getDayVolume()) != 0) return false;
        if (Double.compare(this.getMarketCap(), other.getMarketCap()) != 0) return false;
        if (Double.compare(this.getHourChange(), other.getHourChange()) != 0) return false;
        if (Double.compare(this.getDayChange(), other.getDayChange()) != 0) return false;
        if (Double.compare(this.getWeekChange(), other.getWeekChange()) != 0) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof PriceQuote;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final long $price = Double.doubleToLongBits(this.getPrice());
        result = result * PRIME + (int) ($price >>> 32 ^ $price);
        final long $dayVolume = Double.doubleToLongBits(this.getDayVolume());
        result = result * PRIME + (int) ($dayVolume >>> 32 ^ $dayVolume);
        final long $marketCap = Double.doubleToLongBits(this.getMarketCap());
        result = result * PRIME + (int) ($marketCap >>> 32 ^ $marketCap);
        final long $hourChange = Double.doubleToLongBits(this.getHourChange());
        result = result * PRIME + (int) ($hourChange >>> 32 ^ $hourChange);
        final long $dayChange = Double.doubleToLongBits(this.getDayChange());
        result = result * PRIME + (int) ($dayChange >>> 32 ^ $dayChange);
        final long $weekChange = Double.doubleToLongBits(this.getWeekChange());
        result = result * PRIME + (int) ($weekChange >>> 32 ^ $weekChange);
        return result;
    }

    public String toString() {
        return "PriceQuote{" +
                "price=" + price +
                ", dayVolume=" + dayVolume +
                ", marketCap=" + marketCap +
                ", hourChange=" + hourChange +
                ", dayChange=" + dayChange +
                ", weekChange=" + weekChange +
                '}';
    }
}
