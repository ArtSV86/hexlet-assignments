@import exercise.dto.users.UserPage
@param UserPage page


@template.layout.page(
    content = @`
        <a href="/users/build">New User</a>
         <div>${page.getUser().getFirstName()} ${page.getUser().getLastName()} ${page.getUser().getEmail()} ${page.getUser().getId()}</div>
        `,
    footer = @`
             <p>Thanks for visiting, come again soon!</p>
         `
)