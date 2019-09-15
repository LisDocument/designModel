package j_decorator;

public class Demo {

    //抽象类：建筑
    public abstract class Building {
        protected Paint paint;
        public Building(Paint paint) {
            this.paint = paint;
        }
        public abstract void decorate();
    }

    //接口：油漆
    public interface Paint {
        void decorateImpl();
    }

    //教学楼
    public class TeachingBuilding extends Building {
        public TeachingBuilding(Paint paint) {
            super(paint);
        }

        @Override
        public void decorate() {
            System.out.print("普通的教学楼");
            paint.decorateImpl();
        }
    }

    //实验楼
    public class LaboratoryBuilding extends Building {
        public LaboratoryBuilding(Paint paint) {
            super(paint);
        }

        @Override
        public void decorate() {
            System.out.print("普通的实验楼");
            paint.decorateImpl();
        }
    }

    public class RedPaint implements Paint {
        @Override
        public void decorateImpl() {
            System.out.println("被红色油漆装饰过。");
        }
    }
    public class GreenPaint  implements Paint {
        @Override
        public void decorateImpl() {
            System.out.println("被绿色油漆装饰过。");
        }
    }
    public class BulePaint implements Paint {
        @Override
        public void decorateImpl() {
            System.out.println("被蓝色油漆装饰过。");
        }
    }
    //测试项
    public void main(String[] args) {
        //普通的教学楼被红色油漆装饰。
        Building redTeachingBuilding=new TeachingBuilding(new RedPaint());
        redTeachingBuilding.decorate();
        //普通的教学楼被绿色油漆装饰。
        Building greenTeachingBuilding1=new TeachingBuilding(new GreenPaint());
        greenTeachingBuilding1.decorate();
        //普通的实验楼被红色油漆装饰。
        Building redLaboratoryBuilding=new LaboratoryBuilding(new RedPaint());
        redLaboratoryBuilding.decorate();
        //普通的实验楼被绿色油漆装饰。
        Building greenLaboratoryBuilding=new LaboratoryBuilding(new GreenPaint());
        greenLaboratoryBuilding.decorate();
        //普通的实验楼被蓝色油漆装饰。
        Building blueLaboratoryBuilding=new LaboratoryBuilding(new BulePaint());
        blueLaboratoryBuilding.decorate();
    }
}
