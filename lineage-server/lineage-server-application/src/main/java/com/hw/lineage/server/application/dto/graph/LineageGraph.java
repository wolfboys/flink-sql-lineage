package com.hw.lineage.server.application.dto.graph;

import com.hw.lineage.server.application.dto.graph.link.basic.Link;
import com.hw.lineage.server.application.dto.graph.vertex.Vertex;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: LineageGraph
 * @author: HamaWhite
 */
@Data
@Accessors(chain = true)
public class LineageGraph {

    private List<Vertex> nodes;

    private List<Link> links;

    public LineageGraph() {
        this.nodes = new ArrayList<>();
        this.links = new ArrayList<>();
    }
}
