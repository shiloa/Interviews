package com.shiloa.Interviews;

class Edge<T> {

    private int weight;
    private Vertex<T> src;
    private Vertex<T> dest;

    /**
     * empty edge
     */
    Edge() {
        this.weight = 0;
    }

    /**
     * initialize an edge with just the vertices it contains
     */
    Edge(Vertex<T> src, Vertex<T> dest) {
        this.weight = 0;
        this.src = src;
        this.dest = dest;
    }

    /**
     * initialize an edge with vertices and weight
     */
    Edge(int weight, Vertex<T> src, Vertex<T> dest) {
        this.weight = weight;
    }

    void setWeight(int weight) {
        this.weight = weight;
    }

    int getWeight() {
        return this.weight;
    }

    void setSource(Vertex<T> src) {
        this.src = src;
    }

    Vertex<T> getSource() {
        return this.src;
    }

    void setDestination(Vertex<T> dest) {
        this.dest = dest;
    }

    Vertex<T> getDestination() {
        return this.dest;
    }
}
