package Main;

import java.awt.*;

    public class MainThread extends Thread
    {
        Controller controller;
        public MainThread(Controller controller)
        {
            this.controller = controller;
        }

        @Override
        public void run() {
            super.run();
            while (true) {
                try {


                    controller.render();
                    sleep(10);
                }
                catch (Exception e)
                {
                    System.out.println(e.toString());
                }
            }
        }

}
