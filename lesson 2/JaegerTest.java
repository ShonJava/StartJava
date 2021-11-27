public class JaegerTest {
    public static void main(String[] args) {
        Jaeger jaeger = new Jaeger();
        jaeger.setName("Striker Eureka");
        jaeger.setMark(5);
        jaeger.setOrigin("Australia");
        jaeger.setHeight(76.2f);
        jaeger.setWeight(1.850f);
        jaeger.setKaijuKilled(11);
        jaeger.drift();
        jaeger.move();
        jaeger.run();

        System.out.println();

        jaeger.setName("Gipsy Danger");
        jaeger.setMark(3);
        jaeger.setOrigin("USA");
        jaeger.setHeight(79.25f);
        jaeger.setWeight(1.980f);
        jaeger.setKaijuKilled(11);
        jaeger.drift();
        jaeger.move();
        jaeger.run();
    }
}
