package com.WRWBob.CryptoMarketMonitor.models;

import java.util.Map;

public class Coin {
    private final long id;
    private final String name;
    private final String symbol;
    private final String websiteSlug;
    private final int rank;
    private final double circulatingSupply;
    private final double totalSupply;
    private final double maxSupply;
    private final Map<Currency, PriceQuote> priceQuotes;
    private final long lastUpdated;

    public Coin(long id, String name, String symbol, String websiteSlug, int rank, double circulatingSupply, double totalSupply, double maxSupply, Map<Currency, PriceQuote> priceQuotes, long lastUpdated) {
        this.id = id;
        this.name = name;
        this.symbol = symbol;
        this.websiteSlug = websiteSlug;
        this.rank = rank;
        this.circulatingSupply = circulatingSupply;
        this.totalSupply = totalSupply;
        this.maxSupply = maxSupply;
        this.priceQuotes = priceQuotes;
        this.lastUpdated = lastUpdated;
    }

    public long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getSymbol() {
        return this.symbol;
    }

    public String getWebsiteSlug() {
        return this.websiteSlug;
    }

    public int getRank() {
        return this.rank;
    }

    public double getCirculatingSupply() {
        return this.circulatingSupply;
    }

    public double getTotalSupply() {
        return this.totalSupply;
    }

    public double getMaxSupply() {
        return this.maxSupply;
    }

    public Map<Currency, PriceQuote> getPriceQuotes() {
        return this.priceQuotes;
    }

    public long getLastUpdated() {
        return this.lastUpdated;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Coin)) return false;
        final Coin other = (Coin) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.getId() != other.getId()) return false;
        final Object this$name = this.getName();
        final Object other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
        final Object this$symbol = this.getSymbol();
        final Object other$symbol = other.getSymbol();
        if (this$symbol == null ? other$symbol != null : !this$symbol.equals(other$symbol)) return false;
        final Object this$websiteSlug = this.getWebsiteSlug();
        final Object other$websiteSlug = other.getWebsiteSlug();
        if (this$websiteSlug == null ? other$websiteSlug != null : !this$websiteSlug.equals(other$websiteSlug))
            return false;
        if (this.getRank() != other.getRank()) return false;
        if (Double.compare(this.getCirculatingSupply(), other.getCirculatingSupply()) != 0) return false;
        if (Double.compare(this.getTotalSupply(), other.getTotalSupply()) != 0) return false;
        if (Double.compare(this.getMaxSupply(), other.getMaxSupply()) != 0) return false;
        final Object this$priceQuotes = this.getPriceQuotes();
        final Object other$priceQuotes = other.getPriceQuotes();
        if (this$priceQuotes == null ? other$priceQuotes != null : !this$priceQuotes.equals(other$priceQuotes))
            return false;
        if (this.getLastUpdated() != other.getLastUpdated()) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Coin;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final long $id = this.getId();
        result = result * PRIME + (int) ($id >>> 32 ^ $id);
        final Object $name = this.getName();
        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
        final Object $symbol = this.getSymbol();
        result = result * PRIME + ($symbol == null ? 43 : $symbol.hashCode());
        final Object $websiteSlug = this.getWebsiteSlug();
        result = result * PRIME + ($websiteSlug == null ? 43 : $websiteSlug.hashCode());
        result = result * PRIME + this.getRank();
        final long $circulatingSupply = Double.doubleToLongBits(this.getCirculatingSupply());
        result = result * PRIME + (int) ($circulatingSupply >>> 32 ^ $circulatingSupply);
        final long $totalSupply = Double.doubleToLongBits(this.getTotalSupply());
        result = result * PRIME + (int) ($totalSupply >>> 32 ^ $totalSupply);
        final long $maxSupply = Double.doubleToLongBits(this.getMaxSupply());
        result = result * PRIME + (int) ($maxSupply >>> 32 ^ $maxSupply);
        final Object $priceQuotes = this.getPriceQuotes();
        result = result * PRIME + ($priceQuotes == null ? 43 : $priceQuotes.hashCode());
        final long $lastUpdated = this.getLastUpdated();
        result = result * PRIME + (int) ($lastUpdated >>> 32 ^ $lastUpdated);
        return result;
    }

    public String toString() {
        return "Coin(id=" + this.getId() + ", name=" + this.getName() + ", symbol=" + this.getSymbol() + ", websiteSlug=" + this.getWebsiteSlug() + ", rank=" + this.getRank() + ", circulatingSupply=" + this.getCirculatingSupply() + ", totalSupply=" + this.getTotalSupply() + ", maxSupply=" + this.getMaxSupply() + ", priceQuotes=" + this.getPriceQuotes() + ", lastUpdated=" + this.getLastUpdated() + ")";
    }
}
