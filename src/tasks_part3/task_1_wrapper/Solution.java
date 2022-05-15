package tasks_part3.task_1_wrapper;

public class Solution {

	public Solution() {
		new Thread(new DecoratorRunnableImpl(new DecoratorMyRunnableImpl(new RunnableImpl()))).start();
	}

	public class RunnableImpl implements Runnable {
		@Override
		public void run() {
			System.out.println("RunnableImpl body");
		}
	}

	public class DecoratorRunnableImpl implements Runnable {
		private Runnable component;

		public DecoratorRunnableImpl(Runnable component) {
			this.component = component;
		}

		@Override
		public void run() {
			System.out.println("DecoratorRunnableImpl body");
			component.run();
		}
	}

	public class DecoratorMyRunnableImpl implements Runnable {
		private Runnable component;

		public DecoratorMyRunnableImpl(Runnable component) {
			this.component = component;
		}

		@Override
		public void run() {
			System.out.println("DecoratorMyRunnableImpl body");
			component.run();
		}
	}

}
