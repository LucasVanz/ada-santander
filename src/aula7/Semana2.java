package aula7;

public enum Semana2 {
        DOMINGO(new String[]{"domingo", "dom", "sunday", "dmg"}, 1),
        SEGUNDA_FEIRA(new String[]{"segunda-feira", "segunda", "seg", "monday"}, 2),
        TERCA_FEIRA(new String[]{"terça-feira", "terça", "ter", "tuesday"}, 3),
        QUARTA_FEIRA(new String[]{"quarta-feira", "quarta", "qua", "wednesday"}, 4),
        QUINTA_FEIRA(new String[]{"quinta-feira", "quinta", "qui", "thursday"}, 5),
        SEXTA_FEIRA(new String[]{"sexta-feira", "sexta", "sex", "friday"}, 6),
        SABADO(new String[]{"sábado", "sab"}, 7);

        final String[] name;
        final int dia;

        Semana2(String [] name, int dia){
            this.name = name;
            this.dia = dia;
        }

        public String [] getName(){
            return name;
        }

        public int getDia(){
            return dia;
        }

        public static Semana2 enumDiaSemana2(String nome){
            for (Semana2 dia: Semana2.values()) {
                for (String name :dia.getName()) {
                    if (name.equalsIgnoreCase(nome)){
                        return dia;
                    }
                }
            }
            throw new IllegalArgumentException("Dia inválido " + nome);
        }

    }


