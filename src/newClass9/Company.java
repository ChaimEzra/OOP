package newClass9;

public class Company {
    private String name;
    private Worker[] workers;

    public Worker[] getSeniorWorkers() {
        int count = 0;
        for (int i = 0; i < this.workers.length; i++) {
            if (workers[i].isSenior()) {
                count++;
            }
        }
        Worker[] seniors = new Worker[count];
        for (int i = 0; i < this.workers.length; i++) {
            if (workers[i].isSenior()) {
                seniors[i] = this.workers[i];
            }
        }
        return seniors;
    }

    public Worker[] getNonSeniorWorkers() {
        int count = 0;
        for (int i = 0; i < this.workers.length; i++) {
            if (!workers[i].isSenior()) {
                count++;
            }
        }
        Worker[] nonSeniors = new Worker[count];
        for (int i = 0; i < this.workers.length; i++) {
            if (!workers[i].isSenior()) {
                nonSeniors[i] = this.workers[i];
            }
        }
        return nonSeniors;

    }

    public Worker getHighestPaidNonSeniorWorker() {
        Worker[] nonSenior = this.getNonSeniorWorkers();
        Worker result = nonSenior[0];
        for (int i = 0; i < nonSenior.length; i++) {
            if (nonSenior[i].getSalary() > result.getSalary()) {
                result = nonSenior[i];
            }
        }
        return result;
    }

    public int totalPayments() {
        int result = 0;
        for (int i = 0; i < this.workers.length; i++) {
            result += this.workers[i].getSalary();
        }
        return result;
    }

    public String getName() {
        return this.name;
    }

    public Company(String name, Worker[] workers) {
        this.name = name;
        this.workers = workers;
    }

    public char mostUseName() {
        int count = 0;
        int count2 = 0;
        char result = this.workers[0].getFirstLetter();
        for (int i = 0; i < this.workers.length; i++) {
            count++;
            for (int j = 0; j < workers.length; j++) {
                if (this.workers[i].getFirstLetter() == this.workers[j].getFirstLetter()) {
                    count2++;
                }
            }
            if (count2 > count) {
                count = count2;
                result = this.workers[i].getFirstLetter();
            }
        }
        return result;
    }
}
