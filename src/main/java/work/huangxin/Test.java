package work.huangxin;

import org.tensorflow.*;

public class Test {

    public static void main(String[] args) throws Exception {

        Graph graph = new Graph();

        Operation x = graph.opBuilder("Const", "x")
                .setAttr("dtype", DataType.FLOAT)
                .setAttr("value", Tensor.create(3.0f))
                .build();

        Operation y = graph.opBuilder("Placeholder", "y")
                .setAttr("dtype", DataType.FLOAT)
                .build();


        Operation xy = graph.opBuilder("Mul", "xy")
                .addInput(x.output(0))
                .addInput(y.output(0))
                .build();

        Session session = new Session(graph);

        Tensor tensor = session.runner().fetch("xy").feed("x", Tensor.create(5.0f)).feed("y", Tensor.create(2.0f)).run().get(0);
        System.out.println(tensor.floatValue());
    }

}
