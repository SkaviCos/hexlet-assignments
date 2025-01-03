@import exercise.dto.users.UserPage

@param UserPage page

@template.layout.page(content = @`
    <div>
        <p>${page.getUser().getFirstName()} ${page.getUser().getLastName()}</p>
    </div>
`)