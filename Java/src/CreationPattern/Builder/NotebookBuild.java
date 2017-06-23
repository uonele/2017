package CreationPattern.Builder;
public class NotebookBuild extends computerBuilder
{

        @Override
        public void buildCPU() {
                // TODO Auto-generated method stub
                c.setCpu("cup of Notebook");
        }

        @Override
        public void buildRam() {
                // TODO Auto-generated method stub
                c.setRam("Ram of Notebook");
        }

        @Override
        public void buildHardDisk() {
                // TODO Auto-generated method stub
                c.setHardDisk("HardDisk of Notebook");
        }

        @Override
        public void buildMainframe() {
                // TODO Auto-generated method stub
                c.setMainFrame("mainFrame of Notebook");
        }

        @Override
        public void buildMonitor() {
                // TODO Auto-generated method stub
                c.setMonitor("monitor of Notebook");
        }

}