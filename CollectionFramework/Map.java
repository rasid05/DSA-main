        // In Map, Key must be unique

        HashMap<String, Integer> map = new HashMap<>();
        map.put("Second",20);
        map.put("First",10);
        System.out.println(map);

        // Sort using key
        TreeMap<String, Integer> tmap = new TreeMap<>();
        tmap.put("Second",20);
        tmap.put("First",10);
        tmap.put("Three",30);
        System.out.println(tmap);

        tmap.remove("Three");
        System.out.println(tmap);

        tmap.putIfAbsent("Two", 23);
        tmap.putIfAbsent("Second", 23);
        System.out.println(tmap);

        System.out.println(tmap.get("First"));
        System.out.println(tmap.keySet());
        System.out.println(tmap.values());
        
