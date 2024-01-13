import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task4 {
    static class Company {
        String name;
        int cost;

        Company(String name, int cost) {
            this.name = name;
            this.cost = cost;
        }
    }

    static class Node {
        int parent;
        int cost;
        String company;

        Node(int parent, int cost, String company) {
            this.parent = parent;
            this.cost = cost;
            this.company = company;
        }
    }

    static int n, k;
    static List<Company> companies;
    static List<List<Integer>> graph;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        k = scanner.nextInt();

        companies = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            String name = scanner.next();
            companies.add(new Company(name, Integer.MAX_VALUE));
        }

        graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        List<Node> nodes = new ArrayList<>();
        nodes.add(null);

        for (int i = 1; i <= n; i++) {
            int parent = scanner.nextInt();
            int cost = scanner.nextInt();
            String company = scanner.next();

                nodes.add(new Node(parent, cost, company));

            graph.get(parent).add(i);
        }

        int result = Integer.MAX_VALUE;
        for (Company company : companies) {
            int cost = findMinCost(nodes, company.name);
            if (cost == -1) {
                result = -1;
                break;
            } else {
                result = Math.min(result, cost);
            }
        }

        System.out.println(result);
    }

    static int findMinCost(List<Node> nodes, String company) {
        int minCost = Integer.MAX_VALUE;
        int result = 0;
        boolean found = false;
        for (int i = 1; i <= n; i++) {
            if (nodes.get(i).company.equals(company)) {
                minCost = Math.min(minCost, nodes.get(i).cost);
                found = true;
                result +=minCost;
            }
        }
        return found ? result : -1;
    }
}