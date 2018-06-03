package javalang;

public class Employee {

        int id ;
        String name;
        double salary;

        Employee(){}

        Employee(int id, String name, double salary){
            super();
            this.id=id;
            this.name=name;
            this.salary= salary;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }

        /**
         * we can override toString so that object uses method that we have override instead of tha object class's
         * @return hexa value
         * here also toString method used the hexcode method of object class
         */
        public String toString(){
            return getClass().getName()+"@" + hashCode() + "id " +id +"name "+ name+" salary "+salary;
        }

        /**
         * if we donot call hashcode method from tostring method object will use hashcode method of object class
         * @return hashcode
         * hashcode is mostly used for hashing related data structure
         * it help in searching and hashing is the most efficient searching algorithm with O(1) complexity
         */
        @Override
        public int hashCode() {
            return id;
        }

        //for equals to method
    /**
     * Here equals method of object claass has been overrided so now we have used equal method
     * for content comparision
     * */



    @Override
    public boolean equals(Object obj) {
            String name1 = this.name;
            int id1 = this.id;
            double salary1 = this.salary;
            Employee emp = (Employee) obj;
            String name2 = emp.name;
            int id2 = emp.id;
            double salary2 = emp.salary;
            if (name1.equals(name2) && id1 == id2 && salary1 == salary2) {
                return true;
            } else {
                return false;
            }
        }


}
