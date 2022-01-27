class _937 {
	public boolean isDigitLog(String log) {
		return (Character.isDigit(log.charAt(log.indexOf(' ') + 1)));
	}

	public String[] reorderLogFiles(String[] logs) {

		int pointer = logs.length - 1;

		// Keep digit logs at end of array
		for (int i = logs.length - 1; i >= 0; i--) {
			if (isDigitLog(logs[i])) {
				if (i != pointer) {
					String temp = logs[pointer];
					logs[pointer] = logs[i];
					logs[i] = temp;
				}
				pointer--;
			}
		}

		// Now we have to sort smaller part of array
		Arrays.sort(logs, 0, pointer + 1, (o1, o2) -> {

			int d = o1.substring(o1.indexOf(' ') + 1).compareTo(o2.substring(o2.indexOf(' ') + 1));

			return d != 0 ? d : o1.compareTo(o2);// return o1.compareTo(o2);
		});

		return logs;

		// Solution 1
		// pointer is pointing to last index of letter-logs
		// Arrays.sort(logs, (o1,o2)->{
		// if(isDigitLog(o1)||isDigitLog(o2))
		// {
		// if(isDigitLog(o1)&&isDigitLog(o2))
		// return 0;
		// else if(isDigitLog(o1))
		// return 1;
		// else
		// return -1;
		// }

		// int d= o1.substring(o1.indexOf(' ')+1).compareTo(o2.substring(o2.indexOf('
		// ')+1));

		// if(d!=0)
		// return d;

		// return o1.compareTo(o2);

		// });

		// return logs;

	}
}