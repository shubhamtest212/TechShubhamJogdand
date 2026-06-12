package apiAutomation;

public class POST_Request_Using_POJO_Class {

	public class Employee {
		String name;
		String job;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getJob() {
			return job;
		}

		public void setJob() {
			this.job = job;
		}

		Employee emp = new Employee();

	}

}
