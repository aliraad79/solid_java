# اصول solid

## Single Responsibility Principle
این اصل بیان میکند که هر کلاس یک و فقط یک `دلیل` برای تغییر داشته باشد. به توضیحی دیگر یک کلاس فقط باید تنها یک کار انجام دهد.

## Open Closed Principle
بیان میکند که کلاس ها باید برای گسترش باز باشند و برای تغییر بسته باشند. یعنی اگر ما بخواهیم یک قابلیت جدید یا یک نوع جدید از قابلیت های قبلی را به ان کلاس اضافه کنیم باید امکان ایجاد این تغییرات بدون نیاز به تغییر در کدهای قبلی باشد و تنها نیاز باشد ما کد جدید اضافه کنیم و نه کاملا کلاس را از اول بنویسیم.

## Liskov Substitution Principle
بیان میکند اگر کلاس پدر یک ویژگی داشته باشد کلاس فرزند هم باید ان ویژگی را داشته باشد. به عبارتی دیگر شی از جنس فرزند باید بتواند مانند کلاس پدر عمل بکند و در غیر این صورت دیگر رابطه ارثبری برقرار نیست.

## Interface Segregation Principle
یک شی نباید مجبور باشد که یک interface که نیازی به ان ندارد را پیاده سازی بکند. به عبارتی دیگر کاربر نباید مجبور شود که به توابعی که از انها بهره نمیبرد وابسته شود.

## Dependency Inversion Principle
موجودیت ها باید وابسته به موجودیت های انتزاعی باشند نه موجودیت های کاملا واقعی و پیاده سازی شده. به عبارتی دیگر کلاس های سطح بالا نباید به کلاس های سطح پایین که موارد پیاده سازی در انها وجود دارد وابسته شوند زیرا با کوچکترین تغییر نیاز داریم دوباره انها کامپایل و مستقر شوند.

# در کجا استفاده میشوند
این اصول در همه بخش های مهندسی نرم افزار استفاده میشوند و محدود به یک بخش خاص نیستند زیرا این موارد یک سری اصول هستند که رعایت انها در هر بخش باعث خوانایی بیشتر طراحی خواهد شد. به طور مثال رعایت این اصول در مهندسی نیازمندی باعث میشوند بهتر نیازمندی ها را تشخیص دهیم و user story  های بهتری تولید کنیم و از این طریق به طراحی بهتر برسیم. 
علاوه بر این استفاده از این اصول در استقرار هم باعث ساده تر شدن scale اپ و موارد همچنینی خواهد شد.

# آیا TDD با برنامه نویسی عمومی تناقض دارد؟
خیر - نوشتن تست بعد یا قبل کد در تناقض کامل با یکدیگر نیست صرفا به دلیل نوشتن تست قبل از کد میتوانیم دقیق تر روی کد تمرکز کنیم و از ابتدا کد تمیزتر بنویسیم و به سرعت مشکلات کد را متوجه بشویم. علاوه بر این سپردن نوشتن کد به اینده امکا اهمال کاری و ننوشتن کلی کد را دارد پس بهتر از این روش استفاده شود ولی اجباری وجود ندارد و هر دو روش در یک راستا حرکت میکنند.

## آیا در مسيله مربع و مستطیل بدون نیاز به تغییر ابعاد مستطیل میتوان مربع را از مستطیل ارث بری کرد؟
خیر - در این حالت همچنان هم رابطه is-a 
برقرار نیست و نباید از این ارث بری استفاده کرد.

مربع به صورت کلی رفتارهایی دارد که با مستطیل تفاوت دارد و نباید به این گونه ارث بری را استفاده کرد و بجای ان باید از مثلا یک کلاس دیگر به نام shape استفاده کرد.