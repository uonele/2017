package StructuredPattern.Composite;

public class Client {

        public static void main(String[] args) {
                // TODO Auto-generated method stub
                Institution bj,hn,cx,xt;
                Unit bjjw,bjxz,hnjw,hnxz,cxjw,cxxz,xtjw,xtxz;
                bj = new Institution("北京总部");
                hn = new Institution("湖南分校");
                cx = new Institution("长沙教学点");
                xt = new Institution("湘潭分校");
                bjjw = new Office("北京教务办公室");
                bjxz = new Office("北京行政办公室");
                hnjw = new Office("湖南教务办公室");
                hnxz = new Office("湖南行政办公室");
                cxjw = new Office("长沙教务办公室");
                cxxz = new Office("长沙行政办公室");
                xtjw = new Office("湘潭教务办公室");
                xtxz = new Office("湘潭行政办公室");
                bj.add(bjjw);
                bj.add(bjxz);
                bj.add(hn);
                hn.add(hnxz);
                hn.add(hnjw);
                hn.add(cx);
                hn.add(xt);
                cx.add(cxxz);
                cx.add(cxjw);
                xt.add(xtxz);
                xt.add(xtjw);
                
                bj.handleArchives();
        }

}
