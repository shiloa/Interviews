package com.shiloa.Interviews;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

class Graph<T> {
    private List<Vertex<T>> vertices;
    private List<Edge<T>> edges;

    Graph() {
        this.vertices = Collections.emptyList();
        this.edges = Collections.emptyList();
    }

    Graph(List<Vertex<T>> vertices, List<Edge<T>> edges) {
        this.vertices = vertices;
        this.edges = edges;
    }

    List<Vertex<T>> getVertices() {
        return this.vertices;
    }

    List<Edge<T>> getEdges() {
        return this.edges;
    }

    void addVertex(Vertex<T> vertex) {
        if (vertex != null) {
            this.vertices.add(vertex);
        }
    }

    void addEdge(Edge<T> edge) {
        if (edge != null) {
            this.edges.add(edge);
        }
    }
}
