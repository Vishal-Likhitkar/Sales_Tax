public enum ItemType {
    BOOK(true),
    FOOD(true),
    MEDICAL(true),
    OTHER(false);
    
    private final boolean isExempt;
    
    ItemType(boolean isExempt) {
        this.isExempt = isExempt;
    }
    
    public boolean isExempt() {
        return isExempt;
    }
} 