/*
 * Copyright 2014 CITIUS <http://citius.usc.es>, University of Santiago de Compostela.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package es.usc.citius.hipster.util.graph;


import es.usc.citius.hipster.graph.HipsterGraph;
import es.usc.citius.hipster.util.examples.RomanianProblem;
import org.junit.Before;
import org.junit.Test;

public class RomanianProblemGraph {
    private HipsterGraph<RomanianProblem.City, Double> graph;

    @Before
    public void setUp() {
        graph = RomanianProblem.graph();
    }

    @Test
    public void testAradRoads() {
        System.out.println(graph.edgesOf(RomanianProblem.City.Arad));
        System.out.println(graph.edgesOf(RomanianProblem.City.Sibiu));
    }
}
