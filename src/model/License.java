package model;

import java.time.LocalDate;

public class License {

    private Long id;
    private LocalDate dataOfIssue;
    private LocalDate expirationDate;

    public License(Long id, LocalDate dataOfIssue, LocalDate expirationDate) {
        this.id = id;
        this.dataOfIssue = dataOfIssue;
        this.expirationDate = expirationDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDataOfIssue() {
        return dataOfIssue;
    }

    public void setDataOfIssue(LocalDate dataOfIssue) {
        this.dataOfIssue = dataOfIssue;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    @Override
    public String toString() {
        return "License{" +
                "id=" + id +
                ", dataOfIssue=" + dataOfIssue +
                ", expirationDate=" + expirationDate +
                '}';
    }
}
