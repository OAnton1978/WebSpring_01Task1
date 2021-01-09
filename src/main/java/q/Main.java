package q;

import q.Server.Server;

public class Main {
    public static void main(String[] args) {
        var server = new Server(64);
        server.lisner(9999);
    }
}