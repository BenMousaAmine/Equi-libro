package com.example.Equilibro.Controller.GoogleBookApi;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Item {
    @Override
    public String toString() {
        return "Item{" +
                "kind='" + kind + '\'' +
                ", id='" + id + '\'' +
                ", etag='" + etag + '\'' +
                ", selfLink='" + selfLink + '\'' +
                ", volumeInfo=" + volumeInfo +
                ", saleInfo=" + saleInfo +
                ", accessInfo=" + accessInfo +
                ", searchInfo=" + searchInfo +
                '}';
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEtag() {
        return etag;
    }

    public void setEtag(String etag) {
        this.etag = etag;
    }

    public String getSelfLink() {
        return selfLink;
    }

    public void setSelfLink(String selfLink) {
        this.selfLink = selfLink;
    }

    public VolumeInfo getVolumeInfo() {
        return volumeInfo;
    }

    public void setVolumeInfo(VolumeInfo volumeInfo) {
        this.volumeInfo = volumeInfo;
    }

    public SaleInfo getSaleInfo() {
        return saleInfo;
    }

    public void setSaleInfo(SaleInfo saleInfo) {
        this.saleInfo = saleInfo;
    }

    public AccessInfo getAccessInfo() {
        return accessInfo;
    }

    public void setAccessInfo(AccessInfo accessInfo) {
        this.accessInfo = accessInfo;
    }

    public SearchInfo getSearchInfo() {
        return searchInfo;
    }

    public void setSearchInfo(SearchInfo searchInfo) {
        this.searchInfo = searchInfo;
    }

    private String kind;
    private String id;
    private String etag;
    private String selfLink;
    private VolumeInfo volumeInfo;
    private SaleInfo saleInfo;
    private AccessInfo accessInfo;
    private SearchInfo searchInfo;

    // Getters and setters for all fields

    public static class VolumeInfo {
        @Override
        public String toString() {
            return "VolumeInfo{" +
                    "title='" + title + '\'' +
                    ", authors=" + authors +
                    ", publisher='" + publisher + '\'' +
                    ", publishedDate='" + publishedDate + '\'' +
                    ", description='" + description + '\'' +
                    ", industryIdentifiers=" + industryIdentifiers +
                    ", readingModes=" + readingModes +
                    ", pageCount=" + pageCount +
                    ", printType='" + printType + '\'' +
                    ", categories=" + categories +
                    ", averageRating=" + averageRating +
                    ", ratingsCount=" + ratingsCount +
                    ", maturityRating='" + maturityRating + '\'' +
                    ", allowAnonLogging=" + allowAnonLogging +
                    ", contentVersion='" + contentVersion + '\'' +
                    ", panelizationSummary=" + panelizationSummary +
                    ", imageLinks=" + imageLinks +
                    ", language='" + language + '\'' +
                    ", previewLink='" + previewLink + '\'' +
                    ", infoLink='" + infoLink + '\'' +
                    ", canonicalVolumeLink='" + canonicalVolumeLink + '\'' +
                    '}';
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public List<String> getAuthors() {
            return authors;
        }

        public void setAuthors(List<String> authors) {
            this.authors = authors;
        }

        public String getPublisher() {
            return publisher;
        }

        public void setPublisher(String publisher) {
            this.publisher = publisher;
        }

        public String getPublishedDate() {
            return publishedDate;
        }

        public void setPublishedDate(String publishedDate) {
            this.publishedDate = publishedDate;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public List<IndustryIdentifier> getIndustryIdentifiers() {
            return industryIdentifiers;
        }

        public void setIndustryIdentifiers(List<IndustryIdentifier> industryIdentifiers) {
            this.industryIdentifiers = industryIdentifiers;
        }

        public ReadingModes getReadingModes() {
            return readingModes;
        }

        public void setReadingModes(ReadingModes readingModes) {
            this.readingModes = readingModes;
        }

        public int getPageCount() {
            return pageCount;
        }

        public void setPageCount(int pageCount) {
            this.pageCount = pageCount;
        }

        public String getPrintType() {
            return printType;
        }

        public void setPrintType(String printType) {
            this.printType = printType;
        }

        public List<String> getCategories() {
            return categories;
        }

        public void setCategories(List<String> categories) {
            this.categories = categories;
        }

        public double getAverageRating() {
            return averageRating;
        }

        public void setAverageRating(double averageRating) {
            this.averageRating = averageRating;
        }

        public int getRatingsCount() {
            return ratingsCount;
        }

        public void setRatingsCount(int ratingsCount) {
            this.ratingsCount = ratingsCount;
        }

        public String getMaturityRating() {
            return maturityRating;
        }

        public void setMaturityRating(String maturityRating) {
            this.maturityRating = maturityRating;
        }

        public boolean isAllowAnonLogging() {
            return allowAnonLogging;
        }

        public void setAllowAnonLogging(boolean allowAnonLogging) {
            this.allowAnonLogging = allowAnonLogging;
        }

        public String getContentVersion() {
            return contentVersion;
        }

        public void setContentVersion(String contentVersion) {
            this.contentVersion = contentVersion;
        }

        public PanelizationSummary getPanelizationSummary() {
            return panelizationSummary;
        }

        public void setPanelizationSummary(PanelizationSummary panelizationSummary) {
            this.panelizationSummary = panelizationSummary;
        }

        public ImageLinks getImageLinks() {
            return imageLinks;
        }

        public void setImageLinks(ImageLinks imageLinks) {
            this.imageLinks = imageLinks;
        }

        public String getLanguage() {
            return language;
        }

        public void setLanguage(String language) {
            this.language = language;
        }

        public String getPreviewLink() {
            return previewLink;
        }

        public void setPreviewLink(String previewLink) {
            this.previewLink = previewLink;
        }

        public String getInfoLink() {
            return infoLink;
        }

        public void setInfoLink(String infoLink) {
            this.infoLink = infoLink;
        }

        public String getCanonicalVolumeLink() {
            return canonicalVolumeLink;
        }

        public void setCanonicalVolumeLink(String canonicalVolumeLink) {
            this.canonicalVolumeLink = canonicalVolumeLink;
        }

        private String title;
        private List<String> authors;
        private String publisher;
        private String publishedDate;
        private String description;
        private List<IndustryIdentifier> industryIdentifiers;
        private ReadingModes readingModes;
        private int pageCount;
        private String printType;
        private List<String> categories;
        private double averageRating;
        private int ratingsCount;
        private String maturityRating;
        private boolean allowAnonLogging;
        private String contentVersion;
        private PanelizationSummary panelizationSummary;
        private ImageLinks imageLinks;
        private String language;
        private String previewLink;
        private String infoLink;
        private String canonicalVolumeLink;

        // Getters and setters for all fields
    }

    public static class SaleInfo {
        public String getCountry() {
            return country;
        }

        @Override
        public String toString() {
            return "SaleInfo{" +
                    "country='" + country + '\'' +
                    ", saleability='" + saleability + '\'' +
                    ", isEbook=" + isEbook +
                    ", listPrice=" + listPrice +
                    ", retailPrice=" + retailPrice +
                    ", buyLink='" + buyLink + '\'' +
                    ", offers=" + offers +
                    '}';
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public String getSaleability() {
            return saleability;
        }

        public void setSaleability(String saleability) {
            this.saleability = saleability;
        }

        public boolean isEbook() {
            return isEbook;
        }

        public void setEbook(boolean ebook) {
            isEbook = ebook;
        }

        public ListPrice getListPrice() {
            return listPrice;
        }

        public void setListPrice(ListPrice listPrice) {
            this.listPrice = listPrice;
        }

        public RetailPrice getRetailPrice() {
            return retailPrice;
        }

        public void setRetailPrice(RetailPrice retailPrice) {
            this.retailPrice = retailPrice;
        }

        public String getBuyLink() {
            return buyLink;
        }

        public void setBuyLink(String buyLink) {
            this.buyLink = buyLink;
        }

        public List<Offer> getOffers() {
            return offers;
        }

        public void setOffers(List<Offer> offers) {
            this.offers = offers;
        }

        private String country;
        private String saleability;
        private boolean isEbook;
        public ListPrice listPrice;
        private RetailPrice retailPrice;
        private String buyLink;
        private List<Offer> offers;

        // Getters and setters for all fields

        public static class ListPrice {
            public double getAmount() {
                return amount;
            }

            public void setAmount(double amount) {
                this.amount = amount;
            }

            public double amount;
            private String currencyCode;

            // Getters and setters for all fields
        }

        public static class RetailPrice {
            private double amount;
            private String currencyCode;

            // Getters and setters for all fields
        }

        public static class Offer {
            private int finskyOfferType;
            private ListPrice listPrice;
            private RetailPrice retailPrice;

            // Getters and setters for all fields
        }
    }

    public static class AccessInfo {
        public String getCountry() {
            return country;
        }

        @Override
        public String toString() {
            return "AccessInfo{" +
                    "country='" + country + '\'' +
                    ", viewability='" + viewability + '\'' +
                    ", embeddable=" + embeddable +
                    ", publicDomain=" + publicDomain +
                    ", textToSpeechPermission='" + textToSpeechPermission + '\'' +
                    ", epub=" + epub +
                    ", pdf=" + pdf +
                    ", webReaderLink='" + webReaderLink + '\'' +
                    ", accessViewStatus='" + accessViewStatus + '\'' +
                    ", quoteSharingAllowed=" + quoteSharingAllowed +
                    '}';
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public String getViewability() {
            return viewability;
        }

        public void setViewability(String viewability) {
            this.viewability = viewability;
        }

        public boolean isEmbeddable() {
            return embeddable;
        }

        public void setEmbeddable(boolean embeddable) {
            this.embeddable = embeddable;
        }

        public boolean isPublicDomain() {
            return publicDomain;
        }

        public void setPublicDomain(boolean publicDomain) {
            this.publicDomain = publicDomain;
        }

        public String getTextToSpeechPermission() {
            return textToSpeechPermission;
        }

        public void setTextToSpeechPermission(String textToSpeechPermission) {
            this.textToSpeechPermission = textToSpeechPermission;
        }

        public Epub getEpub() {
            return epub;
        }

        public void setEpub(Epub epub) {
            this.epub = epub;
        }

        public Pdf getPdf() {
            return pdf;
        }

        public void setPdf(Pdf pdf) {
            this.pdf = pdf;
        }

        public String getWebReaderLink() {
            return webReaderLink;
        }

        public void setWebReaderLink(String webReaderLink) {
            this.webReaderLink = webReaderLink;
        }

        public String getAccessViewStatus() {
            return accessViewStatus;
        }

        public void setAccessViewStatus(String accessViewStatus) {
            this.accessViewStatus = accessViewStatus;
        }

        public boolean isQuoteSharingAllowed() {
            return quoteSharingAllowed;
        }

        public void setQuoteSharingAllowed(boolean quoteSharingAllowed) {
            this.quoteSharingAllowed = quoteSharingAllowed;
        }

        private String country;
        private String viewability;
        private boolean embeddable;
        private boolean publicDomain;
        private String textToSpeechPermission;
        private Epub epub;
        private Pdf pdf;
        private String webReaderLink;
        private String accessViewStatus;
        private boolean quoteSharingAllowed;

        // Getters and setters for all fields

        public static class Epub {
            private boolean isAvailable;
            private String acsTokenLink;

            // Getters and setters for all fields
        }

        public static class Pdf {
            private boolean isAvailable;
            private String acsTokenLink;

            // Getters and setters for all fields
        }
    }

    public static class SearchInfo {
        private String textSnippet;

        public String getTextSnippet() {
            return textSnippet;
        }

        @Override
        public String toString() {
            return "SearchInfo{" +
                    "textSnippet='" + textSnippet + '\'' +
                    '}';
        }

        public void setTextSnippet(String textSnippet) {
            this.textSnippet = textSnippet;
        }
    }

    public static class IndustryIdentifier {
        private String type;
        private String identifier;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getIdentifier() {
            return identifier;
        }

        public void setIdentifier(String identifier) {
            this.identifier = identifier;
        }
// Getters and setters for all fields
    }

    public static class ReadingModes {
        private boolean text;
        private boolean image;

        // Getters and setters for all fields
    }

    public static class PanelizationSummary {
        private boolean containsEpubBubbles;
        private boolean containsImageBubbles;

        // Getters and setters for all fields
    }

    public static class ImageLinks {
        private String smallThumbnail;
        private String thumbnail;

        // Getters and setters for all fields
    }
}

