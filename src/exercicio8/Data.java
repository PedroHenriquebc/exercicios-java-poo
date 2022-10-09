package exercicio8;

public class Data {
    private String valorData;

    public void construtor(String valorData) {
        if (valorData.length() == 10) {
            if (valorData.charAt(2) == '/' && valorData.charAt(5) == '/') {
                if (Integer.parseInt(valorData.substring(0, 2)) <= 31 && Integer.parseInt(valorData.substring(3, 5)) <= 12) {
                    this.valorData = valorData;
                } else {
                    this.valorData = "01/01/0001";
                }
            } else {
                this.valorData = "01/01/0001";
            }
        } else {
            this.valorData = "01/01/0001";
        }
    }

    public int getDia() {
        return Integer.parseInt(valorData.substring(0, 2));
    }

    public int getMes() {
        return Integer.parseInt(valorData.substring(3, 5));
    }

    public int getAno() {
        return Integer.parseInt(valorData.substring(6, 10));
    }
    public String compara(Data outraData) {
        if (valorData.equals(outraData.getValorData())) {
            return "Datas iguais";
        }
        if (getAno() > outraData.getAno()) {
            return "Data corrente maior que a data comparada";
        }
        else if (getMes() > outraData.getMes()) {
                return "Data corrente maior que a data comparada";
            }
        else if (getDia() > outraData.getDia() && getMes() >= outraData.getMes()) {
                return "Data corrente maior que a data comparada";
        } else {
            return "Data corrente menor que a data comparada";
        }
    }

    public String getMesExtenso() {
        int mes = getMes();
        String mesExtenso = "";
        switch (mes) {
            case 1:
                mesExtenso = "Janeiro";
                break;
            case 2:
                mesExtenso = "Fevereiro";
                break;
            case 3:
                mesExtenso = "Março";
                break;
            case 4:
                mesExtenso = "Abril";
                break;
            case 5:
                mesExtenso = "Maio";
                break;
            case 6:
                mesExtenso = "Junho";
                break;
            case 7:
                mesExtenso = "Julho";
                break;
            case 8:
                mesExtenso = "Agosto";
                break;
            case 9:
                mesExtenso = "Setembro";
                break;
            case 10:
                mesExtenso = "Outubro";
                break;
            case 11:
                mesExtenso = "Novembro";
                break;
            case 12:
                mesExtenso = "Dezembro";
                break;
        }
        return mesExtenso;
    }

    public boolean isBissexto() {
        if (!(valorData.substring(8, 10).equals("00")) && ((Integer.parseInt(valorData.substring(8, 10)) % 4) == 0)) {
            return true;
        } else if ((valorData.substring(8, 10).equals("00")) && ((getAno() % 400) == 0)) {
            return true;
        } else {
            return false;
        }
    }

    public Data clone() {
        Data dataClone = new Data();
        dataClone.valorData = this.valorData;
        return dataClone;
    }

    public String getValorData() {
        return valorData;
    }

    public void setValorData(String valorData) {
        this.valorData = valorData;
    }
}
