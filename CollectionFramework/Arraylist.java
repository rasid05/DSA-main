//        List is a Interface and ArrayList is a Class
//        We can't make object of interface

        // List
        List list = new ArrayList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(2, 25);
        list.add("Rasid");
        System.out.println(list);

        // Let's Generic This LIst
        List<Integer> l = new ArrayList<>();
        l.add(10);
        l.add(20);
        l.add(50);
        l.add(2, 25);
        // l.add("Rasid");  // error
        System.out.println(l);

        System.out.println("min element " + Collections.min(l));
        System.out.println("max element " + Collections.max(l));
        System.out.println(Collections.frequency(list, 9));

        Collections.sort(l, Comparator.reverseOrder());
        System.out.println(l);

