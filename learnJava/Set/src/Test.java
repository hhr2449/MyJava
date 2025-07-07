import java.util.*;

public class Test {
    public static <Interger, iterator> void main(String[] args) {
        //ArrayList类似cpp中的 vector,可以动态扩容
        List arrayList = new ArrayList ();
        String[] s = {"aa","bb","cc"};
        //使用add方法添加元素
        arrayList.add("apple");
        arrayList.add("apple");
        arrayList.add("banana");
        arrayList.add("orange");
        arrayList.add(new Integer(10));
        arrayList.add(s);
        //使用remove方法移除元素
        arrayList.remove("banana");
        arrayList.add("pear");
        //使用set方法修改下表为idx的元素
        arrayList.set(1, "watermelon");
        //不能使用[]访问元素，应该使用get方法
        System.out.println("索引1的元素是" + arrayList.get(1));
        //java中提供了toString方法，打印数组
        System.out.println("Array: " + arrayList);
        //可以遍历
        for(int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }

        //LinkedList
        //操作是类似的，只是可以定向增，删，查首末元素
        LinkedList<String> linkedlist = new LinkedList<> ();
        linkedlist.add("apple");
        linkedlist.addFirst("orange");
        linkedlist.addLast("pear");
        System.out.println("LinkedList: " + linkedlist);
        System.out.println("第一个元素是" + linkedlist.getFirst());
        System.out.println("最后一个元素是" + linkedlist.getLast());
        for(int i = 0; i < linkedlist.size(); i++) {
            System.out.println(linkedlist.get(i));
        }
        Iterator<String> it = linkedlist.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
        linkedlist.removeFirst();
        linkedlist.removeLast();
        System.out.println("LinkedList: " + linkedlist);


        //Set
        HashSet<String> hashSet = new HashSet<>();
        //Set中的元素不会重复
        hashSet.add("apple");
        hashSet.add("apple");
        hashSet.add("banana");
        hashSet.add("orange");
        hashSet.add("pear");
        System.out.println("Set: " + hashSet);
        //一样的添加和移除方法
        hashSet.remove("apple");
        System.out.println("Set: " + hashSet);
        //使用迭代器遍历
        it = hashSet.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
        //使用toArray方法将set转换为数组
        for(int i = 0; i < hashSet.size(); i++) {
            System.out.println(hashSet.toArray()[i]);
        }

        // Map
        HashMap<Integer, String> hashmap = new HashMap<>();
        //使用put方法来添加元素
        hashmap.put(1, "apple");
        hashmap.put(2, "banana");
        hashmap.put(3, "orange");
        System.out.println("Map: " + hashmap);
        //使用get方法来获取key对应的value
        System.out.println("key为1的元素是：" + hashmap.get(1));
        //使用remove方法来移除key对应的元素
        hashmap.remove(1);
        System.out.println("Map: " + hashmap);
        Set ss = hashmap.keySet();
        Iterator is = ss.iterator();
        while(is.hasNext()) {
            int key = (int)is.next();
            System.out.println(hashmap.get(key));
        }
        Collection c = hashmap.values();
        Iterator ic = c.iterator();
        while(ic.hasNext()) {
            System.out.println(ic.next());
        }

        //queue
        //offer方法添加元素，poll方法取出队首元素，peek方法查看队首元素
        LinkedList<String> queue = new LinkedList<>();
        queue.offer("apple");
        queue.offer("banana");
        queue.offer("orange");
        System.out.println("Queue: " + queue);
        //取出队列所有元素
        while(!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
