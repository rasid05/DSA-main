        Queue<Integer> queue = new LinkedList<>();
        // We implemented LinkedList so we can use all it's method like add and remove
        // Which is similar to queue methods Offer and pool

        // But it's good to use offer and poll because
        // add and remove can throw error if operation not completed and then u have to handel it
        queue.add(10);
        queue.offer(20);
        queue.offer(15);
        queue.add(50);
        System.out.println(queue);
        System.out.println(queue.remove());
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue);
        System.out.println(queue.peek());

        // Double ended Queue
        Deque<Integer> adq = new ArrayDeque<>();
        adq.offer(10);
        adq.offer(20);
        adq.offerLast(30);
        adq.poll();
        adq.pollLast();
        adq.offerFirst(40);
        System.out.println(adq);

        // Minimum value would be in top
        // Other value will be not in order
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(12);
        pq.add(3);
        pq.add(4);
        pq.offer(5);
        pq.offer(6);
        System.out.println(pq);

        // Max Priority queue
        PriorityQueue<Integer> mpq = new PriorityQueue<>(Comparator.reverseOrder());
        mpq.offer(12);
        mpq.add(3);
        mpq.add(4);
        mpq.offer(5);
        mpq.offer(6);
        System.out.println(mpq);
