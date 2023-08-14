package CollectionFramework;

import java.util.*;

public class Explore {
    public static void main(String[] args) {
//        List<Integer> l=new ArrayList<>();
//        l.add(10);
//        l.add(20);
//        l.add(2,30);
//        System.out.println(l);
//        System.out.println(l.size());
//        System.out.println(l.contains(30));
//        System.out.println(l.get(0));
//        System.out.println(l.set(2,40));
//        System.out.println(l);
//        l.remove(Integer.valueOf(30));
//        System.out.println(l);
//        Iterator<Integer> it=l.listIterator();
//        while(it.hasNext())
//        {
//            System.out.println(it.next());
//        }
//        l.clear();
//        System.out.println(l);


//        Stack<Integer> s=new Stack<>();
//        s.push(10);
//        s.push(20);
//        s.push(30);
//        System.out.println(s);
//        System.out.println(s.peek());
//        System.out.println(s.pop());
//        System.out.println(s.pop());
//        System.out.println(s);

//
//        Queue<Integer> q=new LinkedList<>();
//
//        q.add(10);
//        System.out.println(q.element());                        //throws an exception if q is empty
//        q.add(20);
//        System.out.println(q);
//        System.out.println(q.remove(Integer.valueOf(30)));
//        System.out.println(q);
//        System.out.println(q.size());

//        q.clear();
//
//        Queue<Integer> q=new LinkedList<>();
//        System.out.println(q.peek());
//        q.offer(10);
//        q.offer(20);
//        System.out.println(q);
//        System.out.println(q.peek());
//        System.out.println(q);
//        System.out.println(q.poll());
//        System.out.println(q);
//        System.out.println(q.poll());
//        System.out.println(q.poll());

//        PriorityQueue<Integer> p=new PriorityQueue<>(Comparator.reverseOrder());
//        p.add(10);
//        p.add(20);
//        System.out.println(p);
//        System.out.println(p.peek());
//        p.poll();
//        System.out.println(p);

//        ArrayDeque<Integer> a=new ArrayDeque<>();
//        a.offer(10);
//        a.offer(20);
//        a.offer(30);
//        a.offerLast(40);
//        a.offerLast(50);
//        System.out.println(a);
//        a.offerFirst(5);
//        a.offerFirst(4);
//        System.out.println(a);
//        System.out.println(a.peek());
//        System.out.println(a.peekFirst());
//        System.out.println(a.peekLast());
//        System.out.println(a.poll());
//        System.out.println(a.pollFirst());
//        System.out.println(a.pollLast());

//        Set<Integer> s=new HashSet<>();
//        s.add(10);
//        s.add(20);
//        s.add(5);
//        s.add(25);
//        System.out.println(s);
//        System.out.println(s.size());
//        System.out.println(s.contains(20));
//        System.out.println(s.remove(30));
//        System.out.println(s);
//        List<Integer> l=new ArrayList<>(s);
//        Collections.sort(l);     //o(nlog n)
//        System.out.println(l);
//
//        Set<Integer> ss=new TreeSet<>(s);
//        System.out.println(ss);   //o(nlog n)

//        Set<Integer> s=new LinkedHashSet<>();
//        s.add(30);
//        s.add(20);
//        System.out.println(s);
//        System.out.println(s.size());
//        System.out.println(s.contains(20));
//        System.out.println(s.remove(30));
//        System.out.println(s);

//        Set<Integer> s=new TreeSet<>();
//        s.add(10);
//        s.add(20);
//        System.out.println(s);
//        System.out.println(s.size());
//        System.out.println(s.contains(20));
//        System.out.println(s.remove(30));
//        System.out.println(s);

//        Map<String,Integer> m=new LinkedHashMap<>();
//        m.put("SHreya",1);
//        m.put("Radhika",2);
//        m.put("Rahul",3);
//        System.out.println(m);
//        for(Map.Entry<String,Integer> e:m.entrySet())
//        {
//            System.out.println(e);
//            System.out.println(e.getKey());
//            System.out.println(e.getValue());
//            System.out.println(e.getClass());
//        }

//        Map<String,Integer> m=new HashMap<>();
//
//
//        m.put("Rahul",3);
//        m.put("Radhika",2);
//        m.put("SHreya",1);
//        System.out.println(m);
//        for(Map.Entry<String,Integer> e:m.entrySet())
//        {
//            System.out.println(e);
//            System.out.println(e.getKey());
//            System.out.println(e.getValue());
//            System.out.println(e.getClass());
//        }

//        Map<String,Integer> m=new TreeMap<>(new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o2.length()-o1.length();
//            }
//        });
//
//
//        m.put("Rahul",3);
//        m.put("Radhikaaa",2);
//        m.put("SHreyas",1);
//        System.out.println(m);
//        for(String e:m.keySet())
//        {
//            System.out.println(e);
//        }


        // Arrays class

//        Integer[] a={10,20,30,40,50};
//        System.out.println(Arrays.toString(a));
//        Arrays.fill(a,2);
//        System.out.println(Arrays.toString(a));
//        System.out.println(a);
//        System.out.println(Arrays.toString(Arrays.copyOf(a,3)));
//        System.out.println(Arrays.toString(Arrays.copyOfRange(a,0,3)));
//
//
//        ArrayList<Integer> ar=new ArrayList<Integer>(Arrays.asList(a));
//        System.out.println(Collections.min(ar));
    }
}
