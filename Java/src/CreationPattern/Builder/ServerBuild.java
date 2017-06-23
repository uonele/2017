package CreationPattern.Builder;

public class ServerBuild extends computerBuilder{

        @Override
        public void buildCPU() {
                // TODO Auto-generated method stub
                c.setCpu("cup of Server");
        }

        @Override
        public void buildRam() {
                // TODO Auto-generated method stub
                c.setRam("Ram of Server");
        }

        @Override
        public void buildHardDisk() {
                // TODO Auto-generated method stub
                c.setHardDisk("HardDisk of Server");
        }

        @Override
        public void buildMainframe() {
                // TODO Auto-generated method stub
                c.setMainFrame("mainFrame of Server");
        }

        @Override
        public void buildMonitor() {
                // TODO Auto-generated method stub
                c.setMonitor("monitor of Server");
        }

}
