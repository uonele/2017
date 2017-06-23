package CreationPattern.Builder;
public class DesktopBuild extends computerBuilder
{

        @Override
        public void buildCPU() {
                // TODO Auto-generated method stub
                c.setCpu("cup of Desktop");
        }

        @Override
        public void buildRam() {
                // TODO Auto-generated method stub
                c.setRam("Ram of Desktop");
        }

        @Override
        public void buildHardDisk() {
                // TODO Auto-generated method stub
                c.setHardDisk("HardDisk of Desktop");
        }

        @Override
        public void buildMainframe() {
                // TODO Auto-generated method stub
                c.setMainFrame("mainFrame of Desktop");
        }

        @Override
        public void buildMonitor() {
                // TODO Auto-generated method stub
                c.setMonitor("monitor of Desktop");
        }

}