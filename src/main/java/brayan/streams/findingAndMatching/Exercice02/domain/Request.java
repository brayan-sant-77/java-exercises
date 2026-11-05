package brayan.streams.findingAndMatching.Exercice02.domain;

import java.util.Objects;

public class Request {
    private Long id;
    private String status;
    private double valorTotal;


    public Request(Long id, String status, double valorTotal) {
        this.id = id;
        this.status = status;
        this.valorTotal = valorTotal;
    }

    @Override
    public String toString() {
        return "Request{" +
                "id=" + id +
                ", status='" + status + '\'' +
                ", valorTotal=" + valorTotal +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Request request = (Request) o;
        return Objects.equals(id, request.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    public Long getId() {
        return id;
    }

    public String getStatus() {
        return status;
    }

    public double getValorTotal() {
        return valorTotal;
    }
}
