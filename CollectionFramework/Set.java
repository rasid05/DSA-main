        // Order won't be maintained
        // Duplicate not allowed
        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(5);
        set.add(16);
        set.add(2);
        set.add(2);
        System.out.println(set);

        set.remove(5);
        System.out.println(set);
        System.out.println(set.contains(21));
        System.out.println(set.isEmpty());
        System.out.println(set.size());
        set.clear();

        // Order will be maintained
        // Duplicate not allowed
        // Set<Integer> llset = new LinkedHashSet<>();
        LinkedHashSet<Integer> llset = new LinkedHashSet<>();
        llset.add(10);
        llset.add(5);
        llset.add(16);
        llset.add(2);
        llset.add(2);
        System.out.println(llset);

        // Order will be sorted
        Set<Integer> treeset = new TreeSet<>();
        // TreeSet<Integer> treeset = new TreeSet<>();
        treeset.add(10);
        treeset.add(5);
        treeset.add(16);
        treeset.add(2);
        treeset.add(2);
        System.out.println(treeset);
