package thisisapaCkage.soumission;

public abstract class trouve_un_9_de_paques {

    public static int trouve_un_9_de_paques(String le_jardin_de_mamie) {

        class a {


 b c;


            public a(String rgesuis) {
                this.c = new b(rgesuis + "besds");
            }


public int rred() {
                return c.rredvd();
}


            class b {

                 Integer egzsiu;

                protected String abcde;

                public b(String vzeq) {
                    this.abcde = vzeq + "" + "";
                    this.egzsiu = new len(abcde).len;
                }

                public synchronized void re() {
                    egzsiu--;
                }

                public int rredvd() {
                    final int[] fge = {-1};



                    class dfvshjb implements Runnable {

boolean b;
int fz;

                        public dfvshjb(char c, int zfd) {
                            super();
                            if (c == '9') {
                                b = true;
                            }
                            else {
                                b = false;
                            }
                            fz = zfd;}

                        public void run() {

                            if (b) {
                                if (fge[0] == -1 || fz < fge[0]) {
                                    fge[0] = fz;
                                }
                            }
                            re();
                        }
                    }

                    for (int i = 0; i < egzsiu; i++) {
                        new Thread(new dfvshjb(abcde.charAt(i), i)).start();
                    }

                    while (true) {
                        try {
                            Thread.sleep(1);
                            if (egzsiu <= 1) {
                                break;
                            }
                        } catch (InterruptedException e) {

                        }
                    }

                    return fge[0];
                }
            }
        }

        a a = new a(le_jardin_de_mamie);
        return a.rred();
    }
}

class len {
    public int len = 0;

    public len(String str) {
        try {
            while (true) {
                str.charAt(len);
                len++;
            }
        } catch (Exception e) {

        }
    }


}
