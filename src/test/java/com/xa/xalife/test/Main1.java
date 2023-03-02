package com.xa.xalife.test;

import cn.hutool.core.util.StrUtil;
import com.google.common.hash.BloomFilter;
import com.google.common.hash.Funnels;
import lombok.extern.slf4j.Slf4j;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.*;
import java.util.concurrent.*;

import static net.sf.jsqlparser.parser.feature.Feature.comment;

@Slf4j
public class Main1 {

    public static void main(String[] args) {
//        LocalDateTime s = LocalDateTime.now();
//        LocalDateTime e = LocalDateTime.now().minusDays(1);
//        System.out.println(Duration.between(s, e).toMinutes());
//        LocalDateTime visit = LocalDateTime.of(2023, 2, 8, 15, 40, 11);
//        LocalDateTime opt = LocalDateTime.of(2023, 2, 9, 13, 21, 50);
//        int i = 1393 * 60000 - (int) (opt.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli() - visit.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli());
//        System.out.println(i);

//        int i = LocalDate.now().lengthOfYear();
//        System.out.println(i);
//        System.out.println(LocalDate.now().lengthOfMonth());
//        ArrayList<String> s1 = new ArrayList<String>() {{
//            add("a");
//            add("b");
//        }};
//        List<String> s2 = new ArrayList<>();
//        s2.addAll(s1);
//        method(null);

//        Integer a = 1; Integer b = 2; Integer c = null;
//        int i = a * b;
//        Boolean flag = false;
//        // a*b 的结果是 int 类型，那么c会强制拆箱成 int 类型，抛出 NPE 异常
//        Integer result = (flag ? a * b : c);
//        Main1 m1 = new Main1();
//        System.out.println(m1.checkReturn());

//        ThreadLocal<String> tl = new ThreadLocal<>();
//        tl.set("key1");
//        tl.remove();
//        tl.set("key2");
//        System.out.println(tl.get());
        // 创建布隆过滤器对象
//        BloomFilter<Integer> filter = BloomFilter.create(
//                Funnels.integerFunnel(),
//                1500,
//                0.01);
//        // 判断指定元素是否存在
//        System.out.println(filter.mightContain(1));
//        System.out.println(filter.mightContain(2));
//        // 将元素添加进布隆过滤器
//        filter.put(1);
//        filter.put(2);
//        System.out.println(filter.mightContain(1));
//        System.out.println(filter.mightContain(2));

//        Set<String> s1 = new HashSet<String>() {{
//            add("1");
//            add("2");
//            add("3");
//        }};
//        Set<String> s2 = new HashSet<String>() {{
//            add("1");
//            add("2");
//        }};
//        s1.retainAll(s2);
//        System.out.println(s1);

//        String sada = StrUtil.appendIfMissing("sada", StrUtil.AT);
//        System.out.println(sada);

        //
//        SynchronousQueue<String> queue = new SynchronousQueue<>(false);
//        boolean a = queue.offer("aaa");
//        System.out.println(a);
//        queue.add("bbbb");
//        while (!queue.isEmpty()) {
//            System.out.println(queue.poll());
//        }

        LinkedList<Integer> list = new LinkedList<Integer>() {{
            add(1);
            add(100);
            add(99);
            add(88);
            add(77);
            add(86);
        }};

        createBinaryTree(list);

    }

    public static TreeNode createBinaryTree(LinkedList<Integer> list){
        TreeNode node = null;
        if(list == null || list.isEmpty()){
            return null;
        }
        Integer data = list.removeFirst();
        if(data!=null){
            node = new TreeNode(data);
            node.left = createBinaryTree(list);
            node.right = createBinaryTree(list);
        }
        return node;
    }

    /**
     * 打印线程池的状态
     *
     * @param threadPool 线程池对象
     */
    public static void printThreadPoolStatus(ThreadPoolExecutor threadPool) {
        ScheduledExecutorService scheduledExecutorService = new ScheduledThreadPoolExecutor(1);
        scheduledExecutorService.scheduleAtFixedRate(() -> {
            log.info("=========================");
            log.info("ThreadPool Size: [{}]", threadPool.getPoolSize());
            log.info("Active Threads: {}", threadPool.getActiveCount());
            log.info("Number of Tasks : {}", threadPool.getCompletedTaskCount());
            log.info("Number of Tasks in Queue: {}", threadPool.getQueue().size());
            log.info("=========================");
        }, 0, 1, TimeUnit.SECONDS);
    }



    public static void method(String param) {
        switch (param) {
            // 肯定不是进入这里
            case "sth":
                System.out.println("it's sth");
                break;
            // 也不是进入这里
            case "null":
                System.out.println("it's null");
                break;
            // 也不是进入这里
            default:
                System.out.println("default");
        }
    }

    private int x = 0;

    public int checkReturn() {
        try {
            return x++;
        } finally {
// 返回的结果是 2
            return x++;
        }
    }


}
