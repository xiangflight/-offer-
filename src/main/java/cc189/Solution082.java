package cc189;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/1/7
 */

public class Solution082 {

    int m;
    int n;

    public static void main(String[] args) {
        boolean[][] maze = {
                {true, true, false, true},
                {true, true, false, false},
                {false, true, true, true},
                {true, false, true, true}};
        List<List<Point>> paths = new Solution082().getPaths(maze);
        paths.forEach(list -> {
            System.out.println(list);
        });
    }

    List<List<Point>> getPaths(boolean[][] maze) {
        List<List<Point>> paths = new ArrayList<>();
        if (maze == null || maze.length == 0) {
            return paths;
        }
        m = maze.length;
        n = maze[0].length;
        getPaths(maze, m - 1, n - 1, new ArrayList<>(), paths);
        return paths;
    }

    private void getPaths(boolean[][] maze, int row, int column, ArrayList<Point> path, List<List<Point>> paths) {
        if (!inArea(row, column) || !maze[row][column]) {
            return;
        }
        Point point = new Point(row, column);
        path.add(point);
        boolean isAtOrigin = (row == 0) && (column == 0);
        if (isAtOrigin) {
            paths.add(new ArrayList<>(path));
        } else {
            getPaths(maze, row - 1, column, path, paths);
            getPaths(maze, row, column - 1, path, paths);
        }
        path.remove(path.size() - 1);
    }

    private boolean inArea(int row, int col) {
        return (row >= 0 && row <= m) && (col >= 0 && col <= n);
    }


//    ArrayList<Point> getPath(boolean[][] maze) {
//        if (maze == null || maze.length == 0) {
//            return null;
//        }
//        ArrayList<Point> path = new ArrayList<>();
//        HashSet<Point> failedPoints = new HashSet<>();
//        if (getPath(maze, maze.length - 1, maze[0].length - 1, path, failedPoints)) {
//            return path;
//        }
//        return null;
//    }
//
//    private boolean getPath(boolean[][] maze, int row, int col, ArrayList<Point> path, HashSet<Point> failedPoints) {
//        /* if out of bounds or not available, return. */
//        if (col < 0 || row < 0 || !maze[row][col]) {
//            return false;
//        }
//
//        Point p = new Point(row, col);
//
//        if (failedPoints.contains(p)) {
//            return false;
//        }
//
//        boolean isAtOrigin = (row == 0) && (col == 0);
//
//        /* if there's a path from the start to my current location, add my location */
//        if (isAtOrigin || getPath(maze, row, col - 1, path, failedPoints)
//                || getPath(maze, row - 1, col, path, failedPoints)) {
//            path.add(p);
//            return true;
//        }
//        // Cache result
//        failedPoints.add(p);
//        return false;
//    }

    public static class Point {
        int row;
        int col;

        public Point(int row, int col) {
            this.row = row;
            this.col = col;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            Point point = (Point) o;
            return row == point.row &&
                    col == point.col;
        }

        @Override
        public int hashCode() {
            return Objects.hash(row, col);
        }

        @Override
        public String toString() {
            return "Point{" +
                    "row=" + row +
                    ", col=" + col +
                    '}';
        }
    }

}
