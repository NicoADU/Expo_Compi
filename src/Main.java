public static void main(String[] args) {

        // ============================================================
        // 1. CÓDIGO FUENTE
        // ============================================================

        String codigo = "x = 10 + 20 * 2";

        System.out.println("====================================");
        System.out.println("      COMPILADOR SIMPLIFICADO");
        System.out.println("====================================");

        System.out.println("\nCódigo fuente:");
        System.out.println(codigo);


        // ============================================================
        // 2. ANÁLISIS LÉXICO
        // ============================================================
        // El compilador separa el código en TOKENS.

        System.out.println("\n[1] ANÁLISIS LÉXICO");

        String[] tokens = {
                "IDENTIFICADOR(x)",
                "ASIGNACION(=)",
                "NUMERO(10)",
                "SUMA(+)",
                "NUMERO(20)",
                "MULTIPLICACION(*)",
                "NUMERO(2)"
        };

        for (String token : tokens) {
            System.out.println("  " + token);
        }


        // ============================================================
        // 3. ANÁLISIS SINTÁCTICO
        // ============================================================
        // El compilador analiza cómo están organizados los tokens.
        // Aquí simulamos un AST (Abstract Syntax Tree).

        System.out.println("\n[2] ANÁLISIS SINTÁCTICO");

        System.out.println("""
                AST:

                    ASIGNACION
                    /        \\
                   x          +
                             / \\
                           10   *
                               / \\
                              20  2
                """);


        // ============================================================
        // 4. ANÁLISIS SEMÁNTICO
        // ============================================================
        // Comprobamos que las operaciones tengan sentido.

        System.out.println("[3] ANÁLISIS SEMÁNTICO");

        String tipoX = "int";
        String tipo10 = "int";
        String tipo20 = "int";
        String tipo2 = "int";

        System.out.println("  x      -> " + tipoX);
        System.out.println("  10     -> " + tipo10);
        System.out.println("  20     -> " + tipo20);
        System.out.println("  2      -> " + tipo2);

        System.out.println("  20 * 2 -> int");
        System.out.println("  10 + (20 * 2) -> int");

        System.out.println("  ✓ Los tipos son compatibles.");


        // ============================================================
        // 5. REPRESENTACIÓN INTERMEDIA (IR)
        // ============================================================
        // El compilador convierte el AST en una representación
        // intermedia más fácil de optimizar.

        System.out.println("\n[4] REPRESENTACIÓN INTERMEDIA (IR)");

        System.out.println("""
                t1 = 20 * 2
                t2 = 10 + t1
                x  = t2
                """);


        // ============================================================
        // 6. OPTIMIZACIÓN
        // ============================================================
        // El compilador observa que 20 * 2 puede calcularse
        // durante la compilación.

        System.out.println("[5] OPTIMIZACIÓN");

        System.out.println("  Antes:");
        System.out.println("    t1 = 20 * 2");
        System.out.println("    t2 = 10 + t1");
        System.out.println("    x  = t2");

        System.out.println("\n  Después de Constant Folding:");
        System.out.println("    t1 = 40");
        System.out.println("    t2 = 10 + 40");
        System.out.println("    x  = 50");


        // ============================================================
        // 7. GENERACIÓN DE CÓDIGO
        // ============================================================
        // Ahora simulamos instrucciones de una CPU.

        System.out.println("\n[6] GENERACIÓN DE CÓDIGO");

        System.out.println("""
                LOAD R1, 10
                LOAD R2, 40
                ADD  R1, R2
                STORE x, R1
                """);


        // ============================================================
        // 8. EJECUCIÓN
        // ============================================================
        // Finalmente simulamos lo que haría la CPU.

        System.out.println("[7] EJECUCIÓN");

        int x = 10 + 20 * 2;

        System.out.println("  La CPU ejecuta las instrucciones...");
        System.out.println("  Resultado final:");
        System.out.println("  x = " + x);


        // ============================================================
        // RESULTADO
        // ============================================================

        System.out.println("\n====================================");
        System.out.println("Resultado final: x = " + x);
        System.out.println("====================================");
    }