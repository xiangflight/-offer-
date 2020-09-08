package labuladong.ch2;

import java.util.*;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/9/8
 */

public class Twitter {

    private static int timestamp = 0;
    private HashMap<Integer, User> userMap = new HashMap<>();

    public void postTweet(int userId, int tweetId) {
        if (!userMap.containsKey(userId)) {
            userMap.put(userId, new User(userId));
        }
        User u = userMap.get(userId);
        u.post(tweetId);
    }

    public void follow(int followerId, int followeeId) {
        if (!userMap.containsKey(followerId)) {
            User u = new User(followerId);
            userMap.put(followerId, u);
        }
        if (!userMap.containsKey(followeeId)) {
            User u = new User(followeeId);
            userMap.put(followeeId, u);
        }
        userMap.get(followerId).follow(followeeId);
    }

    public void unfollow(int followerId, int followeeId) {
        if (userMap.containsKey(followerId)) {
            User u = userMap.get(followerId);
            u.unfollow(followeeId);
        }
    }

    public List<Integer> getNewsFeed(int userId) {
        List<Integer> res = new ArrayList<>();
        if (!userMap.containsKey(userId)) {
            return res;
        }
        Set<Integer> users = userMap.get(userId).followed;

        PriorityQueue<Tweet> pq = new PriorityQueue<>(users.size(), (a, b) -> (b.time - a.time));

        for (int id: users) {
            Tweet twt = userMap.get(id).head;
            if (twt == null) {
                continue;
            }
            pq.add(twt);
        }

        while (!pq.isEmpty()) {
            if (res.size() == 10) {
                break;
            }
            Tweet twt = pq.poll();
            res.add(twt.id);
            if (twt.next != null) {
                pq.add(twt.next);
            }
        }

        return res;
    }

    private static class Tweet {

        private int id;

        private int time;

        private Tweet next;

        public Tweet(int id, int time) {
            this.id = id;
            this.time = time;
            this.next = null;
        }
    }

    private static class User {

        public Set<Integer> followed;
        public Tweet head;
        private int id;

        public User(int userId) {
            followed = new HashSet<>();
            this.id = userId;
            this.head = null;
            follow(id);
        }

        public void follow(int userId) {
            followed.add(userId);
        }

        public void unfollow(int userId) {
            if (userId != this.id) {
                followed.remove(userId);
            }
        }

        public void post(int tweetId) {
            Tweet twt = new Tweet(tweetId, timestamp);
            timestamp++;
            twt.next = head;
            head = twt;
        }

    }

}
