package fes.aragon.clases;

public class ReglasLaberinto {
    private Array2D laberinto;
    private Stack<int[]> stack;
    private boolean [][] visited;
    private final int startX ,  startY ,endX,endY;
    private final int[] rowMove = {0,-1,0,1};
    private final int[] colMove = {-1,0,1,0};

    public ReglasLaberinto(Array2D laberinto, int startX, int startY, int endX, int endY) {
        this.laberinto = laberinto;
        this.stack = new Stack<>();
        this.visited = new boolean[laberinto.getRowSize()][laberinto.getColSize()];
        this.startX = startX;
        this.startY = startY;
        this.endX = endX;
        this.endY = endY;
    }

    //resolver e imprimir

    public boolean resolverLaberinto (){
        stack.push(new int[]{startX,startY});
        visited[startX][startY] = true;
        laberinto.setItem(startX, startY, '⬤'); // el jugador lo vamos a representar con un puntito
        mostrarLaberinto();

        while (!stack.isEmpty()) {
            int[] current = stack.pop();
            int currentX = current[0];
            int currentY = current[1];

            // si llegamos al final
            if (currentX == endX && currentY == endY) {
                System.out.println("¡Se ha encontrado la salida!");
                return true;
            }

            boolean moved = false;
            // Revisamos las 4 direcciones posibles
            for (int i = 0; i < 4; i++) {
                int nextX = currentX + rowMove[i];
                int nextY = currentY + colMove[i];

                if (isValidMove(nextX, nextY)) {
                    stack.push(new int[]{nextX, nextY});
                    visited[nextX][nextY] = true;
                    laberinto.setItem(nextX, nextY, '⬤');
                    laberinto.setItem(currentX, currentY, '.'); // Dejamos un rastro
                    mostrarLaberinto(); // Imprimimos el laberinto después de cada movimiento
                    moved = true;
                    break;
                }
            }

            // Si no pudimos movernos retrocedemos
            if (!moved) {
                laberinto.setItem(currentX, currentY, '.'); // Marcamos el retroceso con '.'
                mostrarLaberinto();
            }
        }

        System.out.println("No hay solución.");
        return false;
    }

    private boolean isValidMove(int x, int y) {
        return x >= 0 && x < laberinto.getRowSize() &&
                y >= 0 && y < laberinto.getColSize() &&
                !visited[x][y] && laberinto.getItem(x, y) == ' ';  // Verifica si es un camino
    }

    public void mostrarLaberinto() {
        System.out.println(laberinto);
        try {
            Thread.sleep(500);  // Pausas
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
