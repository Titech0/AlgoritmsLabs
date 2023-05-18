Написати програму, яка порівнює швидкість роботи ArrayList та LinkedList (Java)

Порівнюються такі операції:
1. Заповнення масиву
2. Random Access (доступ за індексом)
3. Sequential Access (доступ по ітератору)
4. Вставка на початок списку
5. Вставка у кінець списку
6. Вставка до середини списку


Рекомендації:
- Список заповнюємо випадковими цілими числами в діапазоні від 0 до N (N – розмір списку)
- для кожної операції з наведених - пишемо статичний метод, який приймає узагальнений список List<Integer> list та ряд додаткових необхідних параметрів
	- наприклад, для методу заповнення масиву додатковим параметром буде кількість елементів у списку
	- для методів вставки - кількість елементів для вставки
- у методі main створюємо два списки:
		List<Integer> arrayList = new ArrayList<>();
	    List<Integer> linkedList = new LinkedList<>();
   та послідовно передаємо їх у відповідні методи для заповнення, перебору тощо.
- реалізувати виміри швидкодії та виведення необхідно прямо в методах, а на вхід методу передавати параметр String listType, який може приймати значення ArrayList, LinkedList. Наприклад:
     private static void fill(List<Integer> list, int count, String listType) {
         long time = System.currentTimeMillis();
         ...Some code...
         System.out.printf("Fill %s: %s/n", listType, System.currentTimeMillis() - time);
     }

- приклад виведення програми:
		Кількість елементів у списку: xx
		Число введених елементів: xx
		Fill ArrayList: xx
		Fill LinkedList: xx
		Random access in ArrayList: xx
		Random access in LinkedList: xx
		Sequental access in ArrayList: xx
		Sequental access in LinkedList: xx
		......
		Insert in the middle of ArrayList: xx
		Insert in the middle of LinkedList: xx

- кількість елементів в обох списках однакова (рекомендується 100 000)
- кількість елементів для вставки обох списках однакова (рекомендується 1000)
- Програма оформляється як консольний додаток
- код повинен бути викладений в Git у feature branch і створений merge request в master branch
- Ім'я гілки "lab01"
- Посилання на merge request - мені.