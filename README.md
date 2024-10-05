
<body>

   <h1>BookShop Comic Manager</h1>

  <p><strong>Version:</strong> 1.0</p>
    <p><strong>Repository:</strong> BookShopComicManager</p>
    <p><strong>Author:</strong> Sifiso Msiza</p>
    <h2>Overview</h2>
    <p>
        The <em>BookShop Comic Manager</em> is a simple Java-based application for managing a collection of comic novels, 
        with features to display a list of comics and identify first edition items. 
        The project highlights the importance of software reuse by utilizing a pre-built JAR file, 
        <code>ComicNovel.jar</code>, which encapsulates the essential logic for comic novel objects.
    </p>
    <h2>Key Features</h2>
    <ul>
        <li>Displays a list of available comic novels along with their search codes.</li>
        <li>Allows users to input a comic novel's code to check if it is a first edition (collector's item).</li>
    </ul>
    <h2>Software Reuse</h2>
    <p>
        A major design goal of this application is to promote the reuse of existing software components. 
        The project employs the <code>ComicNovel.jar</code> file, which includes the <code>ComicNovel</code> class, 
        encapsulating the properties and behavior of comic novels. 
        By reusing this class from the JAR file, the project avoids reinventing the wheel, making it more efficient and maintainable.
    </p>
    <p>
        <strong>Advantages of Reusing the JAR File:</strong>
    </p>
    <ul>
        <li>Improves modularity and separation of concerns.</li>
        <li>Reduces development time by leveraging existing, tested components.</li>
        <li>Enhances maintainability and reduces code duplication.</li>
    </ul>


  <h2>Installation Instructions</h2>
    <p>To run this project, follow the steps below:</p>
    <ol>
        <li>Clone the repository: <code>git clone https://github.com/your-username/BookShopComicManager.git</code></li>
        <li>Open the project in your Java IDE (e.g., NetBeans or Eclipse).</li>
        <li>Add the <code>ComicNovel.jar</code> file to the project's libraries.</li>
        <li>Run the <code>BookShop.java</code> class to start the application.</li>
    </ol>

  <h2>How to Use</h2>
    <ol>
        <li>On application startup, the list of available comic novels and their search codes will be displayed in the console.</li>
        <li>Input the code of a comic novel when prompted to check if it is a first edition.</li>
        <li>The application will notify you whether the comic novel is a first edition or not.</li>
    </ol>
    <h2>License</h2>
    <p>This project is licensed under the <em>MIT License</em>.</p>

</body>
</html>
