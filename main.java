public class main {
    public static void main(String[] args) {
        MyArrayList<Integer> list = new MyArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println(list.get(1)); // 20

        list.remove(1);

        System.out.println(list.get(1)); // 30
        System.out.println(list.size()); // 2
    }
}