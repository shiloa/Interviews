package com.shiloa.Interviews;

import java.util.Collections;
import java.util.List;

class Vertex<T> {

    private T data;
    private List<Edge> edges;

    Vertex(T data) {
        this.data = data;
        this.edges = Collections.emptyList();
    }

    void addEdge(Edge edge) {
        this.edges.add(edge);
    }

    List<Edge> getEdges() {
        return this.edges;
    }
}
