@import exercise.dto.users.UserPage
@param UserPage page

<main>
    <h1>${page.getUser().getFirstName()}</h1>
    <p>${page.getUser().getLastName()}</p>
    <p>${page.getUser().getEmail()}</p>
</main>